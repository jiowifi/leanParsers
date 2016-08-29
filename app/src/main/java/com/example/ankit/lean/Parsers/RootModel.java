import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String name;
	public String logo;
	public int id;
	public String schedule_published_on;
	public String timezone;
	public String state;
	public String code_of_conduct;
	public String start_time;
	public String organizer_description;
	public String topic;
	public String email;
	public VersionModel _version;
	public String location_name;

	public RootModel(String privacy, String organizer_name, ArrayList<Social_linksModel> social_links, String background_image, String type, CopyrightModel copyright, CreatorModel creator, String description, Call_for_papersModel call_for_papers, String end_time, String name, String logo, int id, String schedule_published_on, String timezone, String state, String code_of_conduct, String start_time, String organizer_description, String topic, String email, VersionModel version, String location_name) {

		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this._copyright = copyright;
		this._creator = creator;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.name = name;
		this.logo = logo;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.email = email;
		this._version = version;
		this.location_name = location_name;

	}

}