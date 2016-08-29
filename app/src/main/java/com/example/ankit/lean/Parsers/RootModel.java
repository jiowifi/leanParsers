import java.util.ArrayList;

class RootModel {

	public String state;
	public String name;
	public String background_image;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public String timezone;
	public String topic;
	public int id;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public String start_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;

	public RootModel(String state, String name, String background_image, String privacy, String description, String code_of_conduct, String timezone, String topic, int id, String organizer_name, String organizer_description, String schedule_published_on, String start_time, VersionModel version, CreatorModel creator, CopyrightModel copyright, String email, String end_time, ArrayList<Social_linksModel> social_links, String logo, Call_for_papersModel call_for_papers, String type, String location_name) {

		this.state = state;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.topic = topic;
		this.id = id;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._version = version;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;

	}

}