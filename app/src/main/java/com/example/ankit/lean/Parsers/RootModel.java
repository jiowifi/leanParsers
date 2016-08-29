import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;
	public String start_time;
	public String end_time;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String email;
	public int id;
	public String type;
	public String description;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String logo;
	public String name;

	public RootModel(String schedule_published_on, String privacy, String timezone, CopyrightModel copyright, String start_time, String end_time, VersionModel version, String background_image, Call_for_papersModel call_for_papers, String state, String email, int id, String type, String description, String organizer_description, String location_name, String organizer_name, String code_of_conduct, CreatorModel creator, ArrayList<Social_linksModel> social_links, String topic, String logo, String name) {

		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;
		this.start_time = start_time;
		this.end_time = end_time;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.email = email;
		this.id = id;
		this.type = type;
		this.description = description;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.social_links = social_links;
		this.topic = topic;
		this.logo = logo;
		this.name = name;

	}

}