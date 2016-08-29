import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_name;
	public String end_time;
	public String code_of_conduct;
	public String type;
	public String background_image;
	public String logo;
	public String email;
	public String topic;
	public String location_name;
	public String schedule_published_on;
	public String name;
	public int id;
	public CreatorModel _creator;
	public VersionModel _version;
	public String privacy;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;

	public RootModel(String timezone, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, String state, String organizer_name, String end_time, String code_of_conduct, String type, String background_image, String logo, String email, String topic, String location_name, String schedule_published_on, String name, int id, CreatorModel creator, VersionModel version, String privacy, String organizer_description, ArrayList<Social_linksModel> social_links, String start_time) {

		this.timezone = timezone;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.background_image = background_image;
		this.logo = logo;
		this.email = email;
		this.topic = topic;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this._version = version;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.start_time = start_time;

	}

}