import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String background_image;
	public CopyrightModel _copyright;
	public String state;
	public String logo;
	public String organizer_description;
	public String name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public int id;
	public String start_time;
	public String timezone;
	public String privacy;
	public String type;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public String end_time;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(CreatorModel creator, String background_image, CopyrightModel copyright, String state, String logo, String organizer_description, String name, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_name, int id, String start_time, String timezone, String privacy, String type, String email, String description, ArrayList<Social_linksModel> social_links, String location_name, String topic, String end_time, VersionModel version, String code_of_conduct) {

		this._creator = creator;
		this.background_image = background_image;
		this._copyright = copyright;
		this.state = state;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.id = id;
		this.start_time = start_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this.type = type;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this.end_time = end_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}