import java.util.ArrayList;

class RootModel {

	public String type;
	public String organizer_description;
	public String name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public CreatorModel _creator;
	public int id;
	public String logo;
	public String end_time;
	public String description;
	public String topic;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String background_image;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String location_name;

	public RootModel(String type, String organizer_description, String name, String code_of_conduct, String schedule_published_on, String state, CreatorModel creator, int id, String logo, String end_time, String description, String topic, String privacy, String timezone, String organizer_name, String background_image, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, Call_for_papersModel call_for_papers, VersionModel version, String location_name) {

		this.type = type;
		this.organizer_description = organizer_description;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._creator = creator;
		this.id = id;
		this.logo = logo;
		this.end_time = end_time;
		this.description = description;
		this.topic = topic;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.location_name = location_name;

	}

}