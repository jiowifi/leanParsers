import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String schedule_published_on;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String privacy;
	public String state;
	public String timezone;
	public String type;
	public String organizer_name;
	public String organizer_description;
	public String description;
	public String name;
	public String email;
	public String logo;
	public String end_time;
	public String topic;
	public int id;
	public String start_time;
	public CreatorModel _creator;
	public String location_name;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, String schedule_published_on, VersionModel version, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String background_image, String privacy, String state, String timezone, String type, String organizer_name, String organizer_description, String description, String name, String email, String logo, String end_time, String topic, int id, String start_time, CreatorModel creator, String location_name, String code_of_conduct) {

		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.background_image = background_image;
		this.privacy = privacy;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.name = name;
		this.email = email;
		this.logo = logo;
		this.end_time = end_time;
		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this._creator = creator;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;

	}

}