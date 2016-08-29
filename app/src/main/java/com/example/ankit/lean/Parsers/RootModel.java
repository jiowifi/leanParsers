import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String background_image;
	public String start_time;
	public String name;
	public String state;
	public String privacy;
	public String schedule_published_on;
	public String type;
	public String end_time;
	public String email;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public String location_name;
	public String logo;
	public String organizer_description;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, int id, Call_for_papersModel call_for_papers, String timezone, String background_image, String start_time, String name, String state, String privacy, String schedule_published_on, String type, String end_time, String email, CopyrightModel copyright, String topic, String organizer_name, String location_name, String logo, String organizer_description, CreatorModel creator, String description, String code_of_conduct) {

		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.background_image = background_image;
		this.start_time = start_time;
		this.name = name;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;

	}

}