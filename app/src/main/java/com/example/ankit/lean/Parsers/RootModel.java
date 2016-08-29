import java.util.ArrayList;

class RootModel {

	public String start_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String end_time;
	public String name;
	public String state;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String topic;
	public int id;
	public String organizer_description;
	public String code_of_conduct;

	public RootModel(String start_time, VersionModel version, CopyrightModel copyright, String end_time, String name, String state, String email, String description, ArrayList<Social_linksModel> social_links, String privacy, String logo, String location_name, Call_for_papersModel call_for_papers, String timezone, String organizer_name, String schedule_published_on, CreatorModel creator, String background_image, String type, String topic, int id, String organizer_description, String code_of_conduct) {

		this.start_time = start_time;
		this._version = version;
		this._copyright = copyright;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.privacy = privacy;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;
		this.id = id;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;

	}

}