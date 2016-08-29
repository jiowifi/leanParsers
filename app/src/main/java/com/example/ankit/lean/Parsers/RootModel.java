import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String schedule_published_on;
	public String logo;
	public int id;
	public CreatorModel _creator;
	public String state;
	public String description;
	public String privacy;
	public String background_image;
	public String organizer_description;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_name;

	public RootModel(String name, String location_name, String schedule_published_on, String logo, int id, CreatorModel creator, String state, String description, String privacy, String background_image, String organizer_description, String timezone, String email, String code_of_conduct, String start_time, Call_for_papersModel call_for_papers, String type, CopyrightModel copyright, VersionModel version, String end_time, ArrayList<Social_linksModel> social_links, String topic, String organizer_name) {

		this.name = name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._copyright = copyright;
		this._version = version;
		this.end_time = end_time;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}