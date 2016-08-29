import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String topic;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String email;
	public String name;
	public int id;
	public String organizer_name;
	public String code_of_conduct;
	public String privacy;
	public String location_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String start_time;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String description;

	public RootModel(String end_time, String topic, String timezone, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, CopyrightModel copyright, VersionModel version, String email, String name, int id, String organizer_name, String code_of_conduct, String privacy, String location_name, String organizer_description, Call_for_papersModel call_for_papers, String logo, String start_time, String state, CreatorModel creator, String type, String description) {

		this.end_time = end_time;
		this.topic = topic;
		this.timezone = timezone;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;
		this.email = email;
		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.start_time = start_time;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.description = description;

	}

}