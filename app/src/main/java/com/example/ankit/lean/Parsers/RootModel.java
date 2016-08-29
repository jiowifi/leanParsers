import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String end_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String name;
	public String logo;
	public int id;
	public String organizer_description;
	public String location_name;
	public String start_time;
	public VersionModel _version;
	public String state;
	public String background_image;
	public String type;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, String email, CreatorModel creator, Call_for_papersModel call_for_papers, String topic, String end_time, String organizer_name, CopyrightModel copyright, String privacy, String name, String logo, int id, String organizer_description, String location_name, String start_time, VersionModel version, String state, String background_image, String type, String timezone, ArrayList<Social_linksModel> social_links, String description, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.name = name;
		this.logo = logo;
		this.id = id;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.start_time = start_time;
		this._version = version;
		this.state = state;
		this.background_image = background_image;
		this.type = type;
		this.timezone = timezone;
		this.social_links = social_links;
		this.description = description;
		this.code_of_conduct = code_of_conduct;

	}

}