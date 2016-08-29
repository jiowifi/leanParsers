import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String start_time;
	public String description;
	public String name;
	public int id;
	public String organizer_description;
	public String end_time;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String timezone;
	public String location_name;
	public String organizer_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String logo;
	public String email;
	public String topic;

	public RootModel(String privacy, String start_time, String description, String name, int id, String organizer_description, String end_time, String state, String background_image, String code_of_conduct, VersionModel version, CopyrightModel copyright, String timezone, String location_name, String organizer_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String type, Call_for_papersModel call_for_papers, String schedule_published_on, String logo, String email, String topic) {

		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;
		this.name = name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._copyright = copyright;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.social_links = social_links;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.email = email;
		this.topic = topic;

	}

}