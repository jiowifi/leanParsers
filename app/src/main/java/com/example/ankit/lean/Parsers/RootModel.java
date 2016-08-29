import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String schedule_published_on;
	public int id;
	public String name;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String background_image;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public String logo;
	public String type;
	public String code_of_conduct;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String email;
	public String organizer_name;
	public String location_name;

	public RootModel(String organizer_description, String schedule_published_on, int id, String name, String end_time, Call_for_papersModel call_for_papers, String start_time, String background_image, String privacy, CopyrightModel copyright, String state, CreatorModel creator, String logo, String type, String code_of_conduct, String topic, ArrayList<Social_linksModel> social_links, String description, String timezone, VersionModel version, String email, String organizer_name, String location_name) {

		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.name = name;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.background_image = background_image;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this.logo = logo;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.email = email;
		this.organizer_name = organizer_name;
		this.location_name = location_name;

	}

}