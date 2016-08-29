import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public String name;
	public int id;
	public String background_image;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_description;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String state;
	public String organizer_name;
	public String schedule_published_on;
	public String timezone;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String end_time;
	public String code_of_conduct;

	public RootModel(Call_for_papersModel call_for_papers, String email, String description, String name, int id, String background_image, VersionModel version, String topic, CreatorModel creator, String location_name, String organizer_description, String logo, CopyrightModel copyright, String type, String state, String organizer_name, String schedule_published_on, String timezone, String privacy, ArrayList<Social_linksModel> social_links, String start_time, String end_time, String code_of_conduct) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.state = state;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.privacy = privacy;
		this.social_links = social_links;
		this.start_time = start_time;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;

	}

}