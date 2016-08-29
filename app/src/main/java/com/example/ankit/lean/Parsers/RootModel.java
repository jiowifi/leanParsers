import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;
	public String type;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String logo;
	public String privacy;
	public String state;
	public String organizer_name;
	public String organizer_description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String timezone;
	public String name;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;
	public String background_image;
	public String code_of_conduct;

	public RootModel(VersionModel version, String end_time, CreatorModel creator, String type, String topic, Call_for_papersModel call_for_papers, int id, String logo, String privacy, String state, String organizer_name, String organizer_description, String location_name, ArrayList<Social_linksModel> social_links, String start_time, String timezone, String name, String email, String schedule_published_on, CopyrightModel copyright, String description, String background_image, String code_of_conduct) {

		this._version = version;
		this.end_time = end_time;
		this._creator = creator;
		this.type = type;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this.timezone = timezone;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;

	}

}